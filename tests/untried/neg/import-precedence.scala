package uniq1 {
  object X
  package uniq2 {
    object X
    package uniq3 {
      object X
      package uniq4 {
        object X
      }
    }
  }
}

package p1 {
  import uniq1.X
  package p2 {
    import uniq1.uniq2.*
    object Y { def f = X }
  }
}

package p2 {
  import uniq1.uniq2.*
  package p2 {
    import uniq1.X
    object Y { def f = X }
  }
}

package p3 {
  import uniq1.X
  import uniq1.uniq2.*
  object Y { def f = X }
}

package p4 {
  import uniq1.uniq2.*
  import uniq1.X
  object Y { def f = X }
}

package p5 {
  import uniq1.X
  package p6 {
    import uniq1.uniq2.X
    object Y { def f = X }
  }
}

package p6 {
  import uniq1.*
  package p5 {
    import uniq1.uniq2.*
    object Y { def f = X }
  }
}

package p7 {
  import uniq1.*
  import uniq1.uniq2.*
  object Y { def f = X }
}

package p8 {
  import uniq1.X
  import uniq1.uniq2.X
  object Y { def f = X }
}
