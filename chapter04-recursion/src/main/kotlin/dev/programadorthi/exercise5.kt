package dev.programadorthi

fun <T, U> foldLeft(
    list: List<T>,
    defaultValue: U,
    factory: (U, T) -> U
): U {
    tailrec fun corecursive(items: List<T>, acc: U): U = when {
        items.isEmpty() -> acc
        else -> corecursive(items.tail(), factory(acc, items.head()))
    }
    return corecursive(list, defaultValue)
}
