# html-page-parser
Приложение для поиска и подсчёта русских слов на HTML странице по заданной ссылке.  
Результат работы выводится в консоль в виде сообщения логгера с типом INFO.  
Ошибки и предупреждения (сообщения типа ERROR, WARN) пишутся в файл logs/protocol.log
## Запуск
- Склонировать проект `git clone https://github.com/papaklim/html-page-parser.git`
- Собрать приложение `./gradlew clean build`
- Запустить приложение с передачей URL в качестве аргумента `java -jar  build/libs/html-page-parser-1.0-uber.jar https://bash.im/`

## Стек
- Java 11
- Gradle
- Junit5 
- Log4j2  
- Guice
