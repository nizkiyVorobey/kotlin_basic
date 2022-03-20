class User {
    var age: Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }

    var name: String? = null
        get() {
            return if (field == null) "Anonymous" else field
        }
}