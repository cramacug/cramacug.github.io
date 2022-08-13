data class Developer(
    val name: String,
    private val languages: MutableList<Language>,
    private val technologies: MutableList<Technology>,
    private val books: MutableList<Book>,
    private val tools: MutableList<Tool>,
    private val operatingSystems: MutableList<OperatingSystem>
) {

    fun updateTechnology(technology: Technology) {
        technologies.add(technology)
    }

    fun updateBook(book: Book) {
        books.add(book)
    }

    fun getLanguages(): List<Language> = languages
    fun getTechnologies(): List<Technology> = technologies
    fun getBooks(): List<Book> = books
    fun getTools(): List<Tool> = tools
    fun getOperatingSystems(): List<OperatingSystem> = operatingSystems

}

data class Language(val language: String)
data class Technology(val tech: String)
data class Book(val book: String)
data class Tool(val tool: String)
data class OperatingSystem(val os: String)

val languages: MutableList<Language> =
    mutableListOf(
        Language("Java"),
        Language("Kotlin"),
        Language("Python"),
    )

val technologies: MutableList<Technology> =
    mutableListOf(
        Technology("Markdown"),
        Technology("Docker"),
        Technology("Apache Maven"),
        Technology("Gradle"),
        Technology("Git"),
    )

val tools: MutableList<Tool> =
    mutableListOf(
        Tool("Vim"),
        Tool("IntelliJ IDEA"),
        Tool("Jenkins"),
    )

val oss: MutableList<OperatingSystem> =
    mutableListOf(
        OperatingSystem("kUbuntu"),
        OperatingSystem("Ubuntu"),
        OperatingSystem("Debian"),
        OperatingSystem("OS"),
    )

val books: MutableList<Book> =
    mutableListOf(
        Book("Clean code"),
        Book("Clean architecture"),
        Book("Clean craftmanship"),
        Book("Design data-intensive applications"),
        Book("Microservice patterns and best practices"),
        Book("DDD: Tackling complexity in the hearth of Software"),
        Book("Effective Java"),
        Book("Microservices Patterns"),
        Book("Reactive Design Patterns"),
        Book("Clean Code"),
        Book("Clean Architecture"),
        Book("No rules rule"),
        Book("The pragmatic programme")
    )

val marc: Developer =
    Developer(
        "Marc",
        languages,
        technologies,
        books,
        tools,
        oss
    )

fun main() {

}