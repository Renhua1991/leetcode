4 ways to loop arraylist in java.
(1)for(int i=0;i<arraylist.size();i++)
(2)for(int i: arraylist)
(3)while(int j<arraylist.size()){#code...; j++;}
(4)Iterator<Integer> iter = arraylist.iterator;
   while(iter.hasNext()){#code;}

common methods in ArrayList:
(1)add(object); (append to the end of list)
(2)add(index,object); (insert the object at the specified position)
(3)contains(object);
(4)get(index);
(5)indexOf(object); (return the index of first occurrence of the specified element)
(6)isEmpty();
(7)remove(index); (return the object)
(8)remove(object); (return boolean)
(9)size();