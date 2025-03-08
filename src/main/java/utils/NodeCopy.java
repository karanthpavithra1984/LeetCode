package utils;

public class NodeCopy {
    public int val;
    public NodeCopy next;
    public NodeCopy left;
    public NodeCopy right;
    public NodeCopy random;

    public NodeCopy() {
    }

    public NodeCopy(int _val) {
        val = _val;
    }

    public NodeCopy(int _val, NodeCopy _next) {
        val = _val;
        next = _next;
    }

    public NodeCopy(int val, NodeCopy left, NodeCopy right, NodeCopy random) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.random = random;
    }
}