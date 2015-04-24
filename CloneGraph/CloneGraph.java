package leetcode;

import java.util.*;

public class CloneGraph {
	class UndirectedGraphNode {
		 int label;
		 List<UndirectedGraphNode> neighbors;
		 UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
	
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        
        UndirectedGraphNode begin = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.add(node);
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        hm.put(node, begin);
        
        while(!queue.isEmpty()){
            UndirectedGraphNode current = queue.poll();
            for(UndirectedGraphNode a : current.neighbors){
                if(!hm.containsKey(a)){
                    queue.add(a);
                    UndirectedGraphNode n = new UndirectedGraphNode(a.label);
                    hm.put(a, n);
                }
                hm.get(current).neighbors.add(hm.get(a));
            }
        }
        
        return begin;
    }
}
