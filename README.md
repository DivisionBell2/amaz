# amaz
Кейс:
1. На главной странице нажать на кнопку авторизации.
2. На странице логина вторизоваться.
3. На главной странице выполнить поиск по строке "iphone 11 256Gb black"
4. На странице поиска выбрать самое дешевое предложение среди iPhone 256GB Black и перейти на страницу этого товара.
5. На странице товара, положить товар в корзину и перейти в корзину.
6. В корзине удалить товар, оставив корзину пустой.
7. Выйти из аккаунта.

Для запуска необходимо добавить в enum UserData email и password зарегистрированного на amazon пользователя

Отчеты сохраняются в папке TestReport (приложил один для примера). Так как не было никаких указаний по поводу типа отчета, сделал ExtentTestReport

Добавлены видео процесса - chrome и firefox

Проблема:
На странице авторизации (п.2, после ввода для логина работает двухфакторная авторизация по капче и по телефону. Я не могу ее обойти.
В видео chrome - это время 0:10-0:40.
В видео firefox - это время 0:14-0:37.
Пытался решить через подстановку токена пользователя в куке - не помогло.