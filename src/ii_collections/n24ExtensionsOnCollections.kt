package ii_collections

import util.TODO

fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        The function should do the same as '_24_JavaCode.doSomethingStrangeWithCollection'.
        Replace all invocations of 'todoTask24()' with the appropriate code.
    """,
        references = { c: Collection<String> -> _24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> s?.filter { it != null }.length }
    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.max()
    return groupsByLength.values.maxBy { group -> group.size == maximumSizeOfGroup }
}

