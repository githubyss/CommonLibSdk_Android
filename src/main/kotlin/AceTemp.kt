import android.app.Fragment

class AceTemp {

    /** ****************************** Object ****************************** */

    /**  */
    companion object {
        /** 使用 类名::class.java.simpleName 得到的类名，是指定类的类名 */
        /** ::class.java.simpleName 得到的名字是不空的 */
        private val TAG_JAVA_NOTNULL: String = AceTemp::class.java.simpleName
        private val TAG_LAZY_NOTNULL: String by lazy { AceTemp::class.java.simpleName }
        private val TAG_JAVA_NOTNULL_ = AceTemp::class.java.simpleName
        private val TAG_LAZY_NOTNULL_ by lazy { AceTemp::class.java.simpleName }

        /** ::class.simpleName 得到的名字是可空的 */
        private val TAG_JAVA_NULLABLE: String? = AceTemp::class.simpleName
        private val TAG_LAZY_NULLABLE: String? by lazy { AceTemp::class.simpleName }
        private val TAG_JAVA_NULLABLE_ = AceTemp::class.simpleName
        private val TAG_LAZY_NULLABLE_ by lazy { AceTemp::class.simpleName }

        /** 使用这个创建 TAG，将 Class 替换成所属类的类名 */
        private val TAG by lazy { Class::class.java.simpleName }
        val TAG_ by lazy { Fragment::class.java.simpleName ?: "Fragment" }
        private var INSTANCE: Nothing? = null
    }


    /** ****************************** Properties ****************************** */

    /** 使用 this::class.java.simpleName 得到的类名，是指定类的子类的类名 */
    // private var TAG_JAVA_NOTNULL = this::class.java.simpleName
    // private val TAG_LAZY_NOTNULL by lazy { this::class.java.simpleName }


    /** ****************************** Constructors ****************************** */

    /** ****************************** Abstract ****************************** */
    /** ****************************** Open ****************************** */

    /** ****************************** Override ****************************** */
    /** ****************************** Functions ****************************** */

    /** ******************** Getter ******************** */
    /** ********** XXX ********** */

    /** ******************** Creator ******************** */
    /** ******************** Checker ******************** */
    /** ******************** Converter ******************** */
    /** ******************** Processor ******************** */
    /** ******************** Operator ******************** */
    /** ******************** Formatter ******************** */

    /** ****************************** Class ****************************** */
    /** ****************************** Implementations ****************************** */
    /** ****************************** Interface ****************************** */
}
