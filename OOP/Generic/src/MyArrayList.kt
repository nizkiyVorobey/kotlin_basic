import java.util.*

class MyArrayList<T> : MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    companion object {
        fun<E> myArrayListOf(vararg elements: E): MyArrayList<E> {
            val list = MyArrayList<E>()
            for (i in elements) {
                list.add(i)
            }

            return list
        }
    }

    override fun get(index: Int): T {
        array[index]?.let {
            return it as T
        }

        throw IndexOutOfBoundsException()
    }

    override fun add(elem: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }

        array[size] = elem
        size++


    }

    override fun remove(element: T) {
        val finedIndex = array.indexOf(element)
        removeByIndex(finedIndex)
    }

    override fun removeByIndex(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }
}