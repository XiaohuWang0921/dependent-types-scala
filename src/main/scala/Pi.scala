trait Pi[T, F[_ <: T]]:
  def apply[X <: T](x: X): F[X]
