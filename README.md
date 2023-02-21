## Singleton
## Design pattern. Singleton
Write a program for tracking sales in an online store using the Singleton pattern.

Steps:

- Create a SalesRecord class with a private constructor to prevent the creation of instances outside of the class.

- Add a static instance field to store the single instance of the class.

- Implement the getInstance() method, which will check if an instance of the class exists and, if not, create one. The method should return this single instance.

- Add methods for recording sales information, such as recordSale(), which will be called for each sale.

- Implement methods for obtaining sales statistics, such as the getTotalSales() method, which will return the total number of sales.

Expected result:

After running the program, only one instance of the SalesRecord class will be created. 
When each sale is made, the information will be recorded in the single instance of the class. 
Methods for obtaining statistics will use this single instance of the class. 
A global access point to the single instance of the class should be provided by the getInstance() method.

## Задание

Напишите программу для учета продаж в интернет-магазине, используя шаблон Одиночка.

Шаги:

- Создайте класс SalesRecord с закрытым конструктором, чтобы предотвратить создание экземпляров за пределами класса.

- Добавьте статическое поле instance, чтобы хранить единственный экземпляр класса.

- Реализуйте метод getInstance(), который будет проверять, существует ли экземпляр класса, и, если нет, создавать его. Метод должен возвращать этот единственный экземпляр.

- Добавьте методы для записи информации о продажах, такие как recordSale(), которые будут вызываться при каждой продаже.

- Реализуйте методы для получения статистики по продажам, например, метод getTotalSales(), который будет возвращать общее количество продаж.

Ожидаемый результат:

После запуска программы будет создан только один экземпляр класса SalesRecord. 
При каждой продаже информация будет записываться в единственный экземпляр класса. 
Методы для получения статистики будут использовать этот единственный экземпляр класса. 
Глобальная точка доступа к единственному экземпляру класса должна быть обеспечена методом getInstance().
