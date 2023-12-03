enum Eq[S, T]:
  case Refl[T]() extends Eq[T, T]
