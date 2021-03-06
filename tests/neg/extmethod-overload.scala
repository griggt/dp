object Test {
  given a: AnyRef with
    extension (x: Int) {
      def |+| (y: Int) = x + y
    }
  given b: AnyRef with
    extension (x: Int) {
      def |+| (y: String) = x + y.length
    }
  assert((1 |+| 2) == 3)  // error ambiguous

  locally {
    import b.|+|
    assert((1 |+| "2") == 2)  // OK
  }
}