package de.digitalforger.smtl

import com.google.common.collect.Iterators
import java.util.ArrayList

object HigherOrderUtil {
  class ExtendedIterable(lst: java.lang.Iterable[String]) {

  
    //    def findFirst2(fnc: (String) => Boolean): String = {
    //      val it = lst.iterator
    //      while (it.hasNext) {
    //        val s = it.next()
    //        if (fnc(s))
    //          return s
    //      }
    //
    //      return null
    //    }

    /**
     * Returns the first element of the iterable list that will return true by the passed function
     *
     * @param fnc the function that is called on each element of the list
     */
    def findFirst(fnc: (String) => Boolean): String = {
      val it = lst.iterator
      while (it.hasNext) {
        val s = it.next()
        if (fnc(s))
          return s
      }
      return null
    }

    /**
     * Returns an iterable that performs the given transformaiton for each element of original when
     * requested. The mapping is done lazily. That is, subsequent iterations of the elements in the iterable will
     * repeatedly apply the transformation.
     *
     * @param fnc the function that is called on each element of the iterable list
     */
//    def map(fnc: (String) => String): java.lang.Iterable[String] = {
//      val it = lst.iterator
//
//      val retVal = new java.lang.Iterable[String] {
//        def iterator(): java.util.Iterator[String] = {
//          return new java.util.Iterator[String]() {
//            def hasNext(): Boolean = {
//              return it.hasNext();
//            }
//            def next(): String = {
//              return fnc(it.next());
//            }
//            def remove() {
//              it.remove();
//            }
//          };
//        }
//        override def toString(): String = {
//          return Iterators.toString(iterator());
//        }
//      }
//      return retVal;
//    }
  }

  implicit def pimpedIterable(list: java.lang.Iterable[String]) = new ExtendedIterable(list)

  //  class ExtendedString (s: String) {
  //    def ==(e: Integer): Boolean = {
  //      return s.length() == e
  //    }
  //    
  //    //def length() : Integer = return s.length()
  //  }
  //
  //  implicit def pimpedString(s: String) = new ExtendedString(s)
}

object testHigherOrderUtil {
  import HigherOrderUtil._
  import scala.collection.JavaConversions._

  def main(args: Array[String]): Unit = {

    var list = new ArrayList[String]()
    list.add("hello")
    list.add("world")
    list.add("!")

    // [----------------]
    // [	findFirst	]
    // [----------------]    
    // println(list.findFirst(s | s.length == 3)

    //println(list.findFirst2( (e) => if(e.length == 3) return e else return null ))
    println(list.findFirst((e) => e.length() == 1))

    // [----------------]
    // [	map			]
    // [----------------]    
    //println(myStrings.map(e|e.toUpperCase))

    //println(list.map((e) => e.toUpperCase()))    
    println(list.toList map (_.toUpperCase()))
    
  }

  //println(myStrings.findFirst(e|e.length == 3))  
}