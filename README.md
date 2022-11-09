# Java Object#equals() and Object#hashCode() methods overriding

Class Object document: [link](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)

```
public boolean equals(Object obj)
```

Indicates whether some other object is "equal to" this one.

The **equals** method implements an equivalence relation on non-null object references:

1. It is _reflexive_: for any non-null reference value **x**, **x.equals(x)** should return
   **true**.
2. It is _symmetric_: for any non-null reference values **x** and **y**, **x.equals(y)** should
   return **true** if and only if **y.equals(x)** returns **true**.
3. It is _transitive_: for any non-null reference values **x**, **y**, and **z**, if **x.equals(y)**
   returns **true** and **y.equals(z)** returns **true**, then **x.equals(z)** should return
   **true**.
4. It is _consistent_: for any non-null reference values **x** and **y**, multiple invocations of
   **x.equals(y)** consistently return **true** or consistently return **false**, provided no
   information used in **equals** comparisons on the objects is modified.
5. For any non-null reference value **x**, **x.equals(null)** should return **false**.

The **equals** method for class **Object** implements the most discriminating possible equivalence
relation on objects; that is, for any non-null reference values **x** and **y**, this method
returns **true** if and only if **x** and **y** refer to the same object (**x == y** has the
value **true**).

Note that it is generally necessary to override the **hashCode** method whenever this method is
overridden, so as to maintain the general contract for the **hashCode** method, which states that
equal objects must have equal hash codes.

```
public int hashCode()
```

Returns a hash code value for the object. This method is supported for the benefit of hash tables
such as those provided by **HashMap**.

The general contract of **hashCode** is:

1. Whenever it is invoked on the same object more than once during an execution of a Java
   application, the **hashCode** method must consistently return the same integer, provided no
   information used in **equals** comparisons on the object is modified. This integer need not
   remain consistent from one execution of an application to another execution of the same
   application.
2. If two objects are equal according to the **equals(Object)** method, then calling the 
   **hashCode** method on each of the two objects must produce the same integer result.
3. It is not required that if two objects are unequal according to the **equals(java.lang.Object)**
   method, then calling the **hashCode** method on each of the two objects must produce distinct
   integer results. However, the programmer should be aware that producing distinct integer results
   for unequal objects may improve the performance of hash tables.

As much as is reasonably practical, the hashCode method defined by class **Object** does return
distinct integers for distinct objects. (This is typically implemented by converting the internal
address of the object into an integer, but this implementation technique is not required by the
Java™ programming language.)
