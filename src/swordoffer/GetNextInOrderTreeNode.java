package swordoffer;

public class GetNextInOrderTreeNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return pNode;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else {
            //返回第一个右父节点
            while (pNode.next != null) {
                //如果为右父
                if (pNode == pNode.next.left) {
                    return pNode.next;
                } else {
                    pNode = pNode.next;
                }
            }
        }
        return null;
    }
}
