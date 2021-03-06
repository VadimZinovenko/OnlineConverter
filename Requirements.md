# 1 Введение
Online currency Converter (Конвертер валют) – данная программа предназначена для получения информации о курсе валют, а также для перевода из одной валюты в другую. Валютные операции необходимы как в большом, так и в малом бизнесе. Нередко жители одной страны закупают товар другой, чтобы продать и получить прибыль в своей валюте. Это заставляет многих разбираться в вопросах курса валют, покупки и продажи валюты другой страны. На сегодняшний день необязательно искать пункты обмена средств или специально идти для этой цели в банк. Для удобства пользователей были разработаны системы электронного обмена валюты. Они называются конвертеры. Эти системы помогают сэкономить большое количество времени, а также восполняют недостаток информации по актуальному курсу валюты любой страны. 
Конвертация – это процесс обмена одного вида валюты на другой. Конвертировать валюту – это значит, осуществлять платежный обменный процесс между валютами разных государств. Международные рыночные отношения не были бы возможными без этой обменной процедуры. Обмен валюты осуществляется по определенному курсу, который определяет банковская система или регулируют рыночные законы. Валюты разных стран отличаются по способности к конвертации. Они могут быть частично или полностью конвертируемыми. Если национальная валюта полностью конвертируемая, то это дает возможность государству на международном рынке расплачиваться своими деньгами за услуги и товары. Сегодня около 17-ти государств могут утверждать, что у них свободно конвертируемая валюта, рубль пока относится к частично конвертируемой валюте. 
# 2 Требования пользователя
## 2.1. Программные интерфейсы
Кроссплатформенное приложение. Проект использует фреймворк JavaFX и будет взаимодействовать с API НБ РБ. 
## 2.2. Интерфейс пользователя
Главное, стартовое окно. В данном окне мы видим курс валют на данный момент времени. 
https://github.com/VadimZinovenko/OnlineConverter/commit/56fab1ca2a27fe379be42a5163b09c92cec3a3a3
Далее можно выбрать ту валюту, которая нам необходима и конвертировать ее в любую другую валюту.  
https://github.com/VadimZinovenko/OnlineConverter/blob/master/choice-ofcurrencies.PNG
https://github.com/VadimZinovenko/OnlineConverter/blob/master/exchange.PNG
Если с момента запуска прошло некоторое время и Вам нужен самый актуальный курс на данный момент, вы можете нажать кнопку обновить и, если за прошедшее время были изменения в курсе, то Вы сможете отследить их в Вашем главном окне программы. 
https://github.com/VadimZinovenko/OnlineConverter/blob/master/refresh.PNG
## 2.3 Характеристики пользователей
Данное приложение не имеет никаких ограничений к пользователю. Совершенно любой человек может воспользоваться данным приложение имея доступ в интернет.
## 2.4 Предположения и зависимости
При работе с данной программой необходимо иметь доступ к интернету.
# 3 Системные требования
Запуск и работа приложения на следующих операционных системах:
•	Windows
•	Linux
## 3.1 Функциональные требования
    1.Возможность конвертировать валюту.
    2.Данные о курсе валют НБ РБ.
    3.Запрос к серверу для получения информации.

## 3.2 Нефункциональные требования
## 3.2.1 Атрибуты качества
    1. Простой и понятный интерфейс
    2. Кроссплатформенная модель.
    3. Достоверный курс валют на любой момент времени.
