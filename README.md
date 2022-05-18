# Mobility4You

Задача
решение с Java код

Mobility4You е нова компания, която иска да продава коли по интернет.
Mobility4You е решила да не продава дизелови коли, тъй като те много
замърсяват природата. В момента тяхната цел са колите, но в бъдеще могат да
разширят бизнеса с колелета и други превозни средстава.
Mobility4You ви задава файлов формат и изисква да изградите своята
програма на негова база.
Примерен файл:
(очевидно формата на файла не може да бъде променян от вас по никакъв
начин!)
ELECTRIC_CAR Tesla, Model 3, 150KW, 50000Ah, 30000 euro
GAS_CAR Honda, Civic, 1.5L, 80KW, 18000 euro
HYBRID_CAR Toyota, Prius, 1.5L, 50KW, 12000Ah, 24000 euro
Редът на атрибутите (model, engine power, battery capacity, ...) е фиксиран.
Атрибутите според вида кола Electric Car, Gas-powered Car, and Hybrid Car са
както следва:
ELECTRIC_CAR се характеризира с:

- The brand
- The model name
- The power of the engine
- The capacity of the battery
- The price
GAS_CAR се характеризира с:
- The brand
- The model name
- The engine displacement
- The power of the engine
- The price
HYBRID_CAR се характеризира с:
- The brand
- The model name
- The engine displacement
- The power of the engine
- The capacity of the battery
- The price

2

Mobility4You иската да направите програма, която има следната функционалност:
- Чете файл (mobility.txt по зададения формат)
- Запазва прочетените данни в подходяща структура
- Отпечатва целия каталог на екрана
- Позволява добавяне на нови конфигурации от посочените видове коли
(коли от различен вид, двигател, марка и т.н.)
- Позволява записване на целия каталог във файл (в посочения формат)
- Интеракцията с потребителя да става с "графичен интерфейс" в
конзолата със System.out.*. Интерфейса трябва да изглежда по следния
начин:

Please make your choice:
1 - Show the entire Mobility4You catalogue
2 – Add a new electric car
3 – Add a new gas-powered car
4 – Add a new hybrid car
5 - Show the entire Mobility4You catalogue sorted by car-type
6 – Show the entire Mobility4You catalogue sorted by brand
(alphabetically)
7 – Write to file
8 – Stop the program

1 A hybrid car has a traditional combustion engine and an electrical engine.

Option 1
Всички коли са показани на екрана, но с формата от файла:
ELECTRIC_CAR Tesla, Model 3, 150KW, 50000Ah, 30000 euro
GAS_CAR Honda, Civic, 1.5L, 80KW, 18000 euro
HYBRID_CAR Toyota, Prius, 1.5L, 50KW, 12000Ah, 24000 euro

Option 2, 3 & 4
- Чрез подходящи въпроси искайте информация за всяко едно поле,
според вида на колата.

Option 5&6
- Покажете според условието списък на всички коли в каталога, като
листването става в познатия формат от файла.
- Препоръчително е да използвате Comparator, за да извършите
сортировката.

Option 7
Данните да бъдат записани във файл в същия формат от файла за четене. Нека
при запис да презаписвате файла, от който сте прочели началните данни.
Option 8

3

Изход от приложението.
Насоки за решаване:
- Помислете за подходящо наследяване.
- Името на файла за четене да не бъде фиксиран в кода, нека да се въвежда
от потребителя
- За добра оценка програмата трябва да се представи като програмен код и
задължително да се компилира без грешки. Спазвайте добрия стил на
програмиране, като следвате конвенциите за писане на код в Java за
именуване и подредба на програмния код.
