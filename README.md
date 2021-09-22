1. Запустить данный проект
2. Запустить Postman
3. В Postman-е выбрать POST/PUT запрос на домен http://localhost:8080/message
4. Ввести в Headers в колонку Key текст Content-Type, и в колонку Value текст application/json
5. Ввести в Body в id-число, name-строку, surname-строку, credit-число.
Например:
{
  "id": 1,
  "name": "Imya",
  "surname": "Familiya",
  "credit": 10000
}
6. Отправьте запрос.
