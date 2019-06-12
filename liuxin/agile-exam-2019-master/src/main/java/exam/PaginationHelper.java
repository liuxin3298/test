package exam;

import java.util.List;
public class PaginationHelper<I> {
	
	
	List<I> collection=null;
	int itemsPerPage=0;
	
    
    public PaginationHelper(List<I> collection, int itemsPerPage) {
    	this.collection=collection;
    	this.itemsPerPage=itemsPerPage;
    }
  
    public int itemCount() {
    	 return collection.size();
         throw new RuntimeException();
     
    }  
    public int pageCount() {
    	int count = (int)Math.ceil(collection.size()/itemsPerPage);
    	return count;	
        throw new RuntimeException();
       
    }
    public int pageItemCount(int pageIndex) { 
    
    	double count = Math.ceil(collection.size()/itemsPerPage);
    	if(pageIndex < 0 || pageIndex >= count)
    		return -1;
    	else {
    		if (pageIndex >= 0 || pageIndex < count-1)
    			return itemsPerPage;
    		else
    			return collection.size()-(itemsPerPage+1)*itemsPerPage;
    	} 
       	throw new RuntimeException();
    }
    public int pageIndex(int itemIndex) {
    
        if(itemsPerPage<0 || itemsPerPage  >= collection.size())
        	return -1;
		else {
        	int shang = itemIndex/itemsPerPage;
        	int yushu = itemIndex%itemsPerPage;
        	if(yushu == 0)
        		return shang -1;
        	else
        		return shang;
        }
       	 throw new RuntimeException();
    }
}