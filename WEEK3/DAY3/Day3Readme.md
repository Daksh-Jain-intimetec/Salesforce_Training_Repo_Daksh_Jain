# DAY 3

## Characteristics of a Map:
Because a Map is not a true collection, its characteristics and behaviors are different than the other collections like List or Set.

A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null value (HashMap and LinkedHashMap) but some does not (TreeMap).

The order of a map depends on specific implementations, e.g TreeMap and LinkedHashMap have predictable order, while HashMap does not.  

## Why and When Use Maps:
Maps are perfectly for key-value association mapping such as dictionaries. Use Maps when you want to retrieve and update elements by keys, or perform lookups by keys. Some examples:
A map of error codes and their descriptions.
A map of zip codes and cities.
A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
A map of classes and students. Each class (key) is associated with a list of students (value).
This tutorial provides code examples around the three major implementations of Map which are described below.

## Implementations of Map
In the inheritance tree of the Map interface, there are several implementations but only 3 major, common, and general purpose implementations - they are HashMap and LinkedHashMap and TreeMap. Let’s see the characteristics and behaviors of each implementation:

1. HashMap: this implementation uses a hash table as the underlying data structure. It implements all of the Map operations and allows null values and one null key. This class is roughly equivalent to Hashtable - a legacy data structure before Java Collections Framework, but it is not synchronized and permits nulls. HashMap does not guarantee the order of its key-value elements. Therefore, consider to use a HashMap when order does not matter and nulls are acceptable.
 

2. LinkedHashMap: this implementation uses a hash table and a linked list as the underlying data structures, thus the order of a LinkedHashMap is predictable, with insertion-order as the default order. This implementation also allows nulls like HashMap. So consider using a LinkedHashMap when you want a Map with its key-value pairs are sorted by their insertion order.
 

3. TreeMap: this implementation uses a red-black tree as the underlying data structure. A TreeMap is sorted according to the natural ordering of its keys, or by a Comparator provided at creation time. This implementation does not allow nulls. So consider using a TreeMap when you want a Map sorts its key-value pairs by the natural order of the keys (e.g. alphabetic order or numeric order), or by a custom order you specify.

## Map Operations in Java

The Map interface in Java, part of the java.util package, is used to store key-value pairs. Below are the common operations you can perform with a Map:

1. Basic Operations
put(K key, V value): Adds a key-value pair to the map. If the key already exists, it updates the value.

get(Object key): Retrieves the value associated with the specified key.

remove(Object key): Removes the key-value pair for the specified key.

containsKey(Object key): Checks if the map contains the specified key.

containsValue(Object value): Checks if the map contains the specified value.

size(): Returns the number of key-value pairs in the map.

isEmpty(): Checks if the map is empty.

clear(): Removes all key-value pairs from the map.

2. Iteration

keySet(): Returns a Set of all keys in the map.

values(): Returns a Collection of all values in the map.

entrySet(): Returns a Set of all key-value pairs as Map.Entry objects, which can be iterated.

3. Advanced Operations

replace(K key, V value): Replaces the value for the specified key.

replace(K key, V oldValue, V newValue): Replaces the value only if the key is mapped to the specified old value.

putIfAbsent(K key, V value): Adds the key-value pair only if the key is not already present.

merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction): Combines values for a key using a remapping function.

compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): Computes a new value for the key.

computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction): Computes a value if the key is not already present.

computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction): Computes a new value if the key is already present.

Common Implementations

HashMap: Unordered, allows null keys and values.

LinkedHashMap: Maintains insertion order.

TreeMap: Sorted by keys.

Hashtable: Synchronized, does not allow null keys or values.

## Advantages of Using Maps

Fast Data Retrieval → HashMap offers near O(1) lookup.

Unique Keys → Prevents duplicate keys.

Flexible Implementations → Choose between HashMap (fast), LinkedHashMap (order), TreeMap (sorted).

Easy Key-Value Association → Natural fit for dictionary, caching, and indexing.

Powerful Methods →

get(key), put(key, value)

containsKey(key), containsValue(value)

keySet(), values(), entrySet()

## Daily Practice Assessments

### **Write a program to search set or map of internet plan objects for internet plans that fits the customer price requirements.**
### eg; if there are 3 plans (600, 800, 1000). if customer searches for 900, it should show 800 and 1000 plans
Ans - **Code1DPA1**