enum Sigma[T, F[_ <: T]]:
  case S[T, F[_ <: T], X <: T](fst: X, snd: F[X]) extends Sigma[T, F]