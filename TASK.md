Мы создадим простой REST API, который умеет отдавать список книг и информацию по конкретной книге. Это как маленький backend для книжного магазина или библиотеки

### Создай ветку со своей фамилией
Например: `feature/golgan-task`

### Создай класс `Book` со следующими полями:
```java
public class Book {
	private Long id;
	private String title;
	private String author;
	private Integer year;

	// ...
}
```
### API-эндпоинты
В контроллере реализуй следующие пути:

| Метод   | Путь              | Описание                                      |
| ------- | ----------------- | --------------------------------------------- |
| **GET** | `/api/books`      | Вернуть список всех книг (JSON)               |
| **GET** | `/api/books/{id}` | Найти книгу по ID и вернуть её                |
| **GET** | `/api/books/{id}` | Если ID не найден — вернуть **404 Not Found** |

### Подсказка контроллера в проекте
```java
@GetMapping("/{id}")
public ResponseEntity<Book> getBookById(@PathVariable Long id) {
    Book book = bookService.findById(id);
    if (book == null) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(book);
}
```

### Примеры ответов API
```http
GET /api/books
[
  {
    "id": 1,
    "title": "Война и мир",
    "author": "Толстой",
    "year": 1869
  },
  {
    "id": 2,
    "title": "Преступление и наказание",
    "author": "Достоевский",
    "year": 1866
  }
]
```

```http
GET /api/books/1
{
  "id": 1,
  "title": "Война и мир",
  "author": "Толстой",
  "year": 1869
}

```

### В процессе разработки сделай минимум 3 коммита
Например (названия коммитов): `Добавленние апи путей в контроллере`, `разработка bookService`, `исправление ошибок `
*\*Можно и на английском*

### Завершение работы.
Отправь **Pull request** из своей ветки в ветку основного репозитория