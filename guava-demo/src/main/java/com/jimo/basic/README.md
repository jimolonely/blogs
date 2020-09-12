
# Optional

避免直接使用null。

```java
    @Test
    public void testOptional() {
        // 使用of创建，不允许为null
        final Optional<Integer> i = Optional.of(3);
        if (i.isPresent()) {
            assertEquals(3, (int) i.get());
        } else {
            assertNull(i.get());
        }

        // 使用fromNullable创建
        final Optional<Integer> i2 = Optional.fromNullable(null);
        assertFalse(i2.isPresent());

        // 直接创建为null
        final Optional<Integer> i3 = Optional.absent();
        // i3.get(); // java.lang.IllegalStateException: Optional.get() cannot be called on an absent value
        assertFalse(i3.isPresent());
    }
```

# Preconditions

先决条件，该类包含了n个静态方法，检查变量是否满足条件；可以使代码更加整洁。

```java
@Test
public void testPreconditions() {
    int a = 10;
    int b = 20;
    List<Integer> list = new ArrayList<>();
    assertThrows(IllegalArgumentException.class, () -> Preconditions.checkArgument(a > b, "%s must > %s", a, b));
    assertThrows(NullPointerException.class, () -> Preconditions.checkNotNull(null));
    assertThrows(IllegalStateException.class, () -> Preconditions.checkState(list.size() > 0));
    assertThrows(IndexOutOfBoundsException.class, () -> Preconditions.checkElementIndex(10, list.size()));
}
```

# Ordering

