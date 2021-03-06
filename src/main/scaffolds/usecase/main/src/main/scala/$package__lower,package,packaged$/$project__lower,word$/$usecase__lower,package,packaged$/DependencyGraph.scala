package $package;format="lower,package"$
package $project;format="lower,word"$
package $usecase;format="lower,package"$

object DependencyGraph extends (Array[String] => Controller) {
  final override def apply(args: Array[String]): Controller =
    Controller(
      boundary = Boundary(
        gateway = $db;format="Camel"$EntityGateway.apply
      )
    )
}
