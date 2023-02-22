package org.tetrabox.example.server.lrp;

import java.util.function.Function;

public class Either<L, R> {

    private L left;
    private R right;

    public Either(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public Object get() {
        if (left != null)
            return left;
        if (right != null)
            return right;
        return null;
    }

    public boolean isLeft() {
        return left != null;
    }

    public boolean isRight() {
        return right != null;
    }

    public <T> T map(
            Function<? super L, ? extends T> mapLeft,
            Function<? super R, ? extends T> mapRight) {
        if (isLeft()) {
            return mapLeft.apply(getLeft());
        }
        if (isRight()) {
            return mapRight.apply(getRight());
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Either<?, ?>) {
            Either<?, ?> other = (Either<?, ?>) obj;
            return (this.left == other.left && this.right == other.right)
                    || (this.left != null && other.left != null && this.left.equals(other.left))
                    || (this.right != null && other.right != null && this.right.equals(other.right));
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (this.left != null)
            return this.left.hashCode();
        if (this.right != null)
            return this.right.hashCode();
        return 0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Either [").append(System.lineSeparator());
        builder.append("  left = ").append(left).append(System.lineSeparator());
        builder.append("  right = ").append(right).append(System.lineSeparator());
        return builder.append("]").toString();
    }
}
