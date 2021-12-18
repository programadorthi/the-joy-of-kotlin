package dev.programadorthi

fun <T, U> foldRight(
    list: List<T>,
    defaultValue: U,
    factory: (T, U) -> U
): U = when {
    list.isEmpty() -> defaultValue
    else -> factory(list.head(), foldRight(list.tail(), defaultValue, factory))
}