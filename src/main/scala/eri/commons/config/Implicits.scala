package eri.commons.config

import scala.language.implicitConversions
import scala.reflect.ClassTag

object Implicits {
  implicit def cfgOptImplicitly[A: ConfigReader](ssc: SSConfig): Option[A] = ssc.asOption[A]
}
