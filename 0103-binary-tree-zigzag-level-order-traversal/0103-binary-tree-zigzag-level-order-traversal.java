/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> list = new ArrayList<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // int level =1;
        // q.add(root);
        // if(root==null){
        //     return list;
        // }
        // while(true){
        //     int size = q.size();
        //     if(size==0){
        //         return list;
        //     }
        //     List<Integer> data = new ArrayList<>();
        //     while(size>0){
        //         TreeNode temp = q.poll();
        //         data.add(temp.val);
             
        //          if(temp.left!=null){
        //             q.add(temp.left);
        //         }
        //         if(temp.right!=null){
        //             q.add(temp.right);
        //         }
        //         size--;
        //     }
        //     if(level % 2 != 0){
        //         list.add(data);
        //     }

        //     if(level % 2 == 0){
        //         Collections. reverse(data);
        //         list.add(data);
        //     }
            
           
        //     level++;
            
        // }

        	List<List<Integer>> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            Deque<TreeNode> q = new LinkedList<>();
            q.add(root);
            boolean reverse = false;
            while(!q.isEmpty()){
                int levelSize = q.size();
                List<Integer> list = new ArrayList<>();
                for(int i=0; i<levelSize; i++){
                  
                    if(!reverse){
                    TreeNode curr = q.poll();
                    list.add(curr.val);
                        if(curr.left!=null){
                            q.add(curr.left);
                        }
                         if(curr.right!=null){
                            q.add(curr.right);
                        }

                    }else if(reverse){
                          TreeNode curr = q.pollLast();
                           list.add(curr.val);

                         if(curr.right!=null){
                            q.addFirst(curr.right);
                        }
                        if(curr.left!=null){
                            q.addFirst(curr.left);
                        }
                    }

                }
                reverse = !reverse;
                result.add(list);
            }
            return result;
    }
}