# Калькулятор

## Описание

Консольное приложение “Калькулятор”. Приложение читает из консоли введенные пользователем арифметические операции и выводить в консоль результат их выполнения.

## Требования

1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
3. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
4. Калькулятор умеет работать только с целыми числами.
5. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
6. При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.
7. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
8. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.

## Пример работы программы

###### Input:
`1 + 2`

###### utput:
`3`

###### Input:
`VI / III`

###### Output:
`II`
