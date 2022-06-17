# CurseWorkJavaCarsPark
Курсовая работа по Java. Разработка сайта на тему "Парк машин"
Цель работы: разработать веб-приложение на языке программирования Java по заданной теме.
	Задачи:
1.	Реализовать одностраничное веб-приложение, удовлетворяющее запросам пользователей.
2.	Создать удобный и организованный интерфейс.
3.	Предоставить быстрый доступ к информации.
4.	Разработать защиту для раздела администрации.

Требования к содержанию веб-приложения
	Клиентская часть:
1.	Отвечает за графический интерфейс пользователя;
2.	Отвечает за обмен данными с серверной частью.
В веб-приложении должны быть реализованы 2 вида клиентов:
1.	Обычный пользователь;
2.	Пользователь с правами администрации.

Доступные действия для администратора:
1.	Просмотр парка машин;
2.	Доступ к базе данных;
3.	Добавления новых автомобилей в парк на сайте.

Доступные действия для обычного пользователя:

1.	Просмотр контактной информации;
2.	 Просмотр информации о компании:
3.	Просмотр парка автомобилей;
4.	Просмотр партнёров компании.

Выбор и обоснования инструментов разработки
	Для работы с базой данных будет использоваться СУБД MySQL, выбор сделан на основе того, что данная СУБД преподавалась на курсе,
  и уже достаточно изучена для ее использования в курсовой работе.
	Для подключения программного продукта к базе данных будет использоваться Spring Data JPA.
	Для написания кода будет использоваться IntelliJ IDEA 2021.3, т.к. данная IDE использовалась для выполнения ряда лабораторных работ,
  и достаточно изучена для использования в курсовой работе. Для разработки клиентской части, т.е. фронтенда был выбран язык гипертекстовой 
  разметки, также был выбран CSS для описания внешнего вида веб-страницы, и JavaScript для красивых анимаций сайта.
  
Разработка структуры веб-приложения
	Веб-приложение состоит из серверной и клиентской частей. Серверная часть подключена к базе данных, она получает запросы от клиентских частей, 
  обрабатывает информацию и передаёт ответ обратно клиентской части. Клиентская часть позволяет пользователю взаимодействовать с ней при помощи 
  интерфейса. Клиентская часть обрабатывает пользовательские команды и отправляет запросы с необходимой информацией на экран в виде интерфейса. 
	В базе данных будет создана таблица cars, для хранения информации об автомобилях(id, названия автомобиля, тип коробки передачи, мощность 
  двигателя, тип привода, год выпуска автомобиля, посуточная цена, ссылка на картинку автомобиля).
Вывод
1.	Был произведен поиск информации по заданной теме и на основе собранного материала было сформировано веб-приложение.
2.	Поставленные задачи были выполнены.
3.	Требования к содержанию веб-приложения были выполнены, оно содержит логически связанную информацию в виде текста и иллюстраций.
4.	Требования к оформлению были выполнены, веб-приложение удовлетворяет запросу о единстве стилевого оформления, удобстве навигации,
структурирование текста, наличие анимации.
5.	Были использованы все обязательные и необязательные средства: Java, библиотека Java Spring, HTML, CSS, JavaScript.
6.	Была реализована защита разделов для администрации.
