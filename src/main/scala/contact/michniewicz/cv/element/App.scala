package contact.michniewicz.cv.element

import com.raquo.laminar.api.L.{Element, Var, className, div}
import contact.michniewicz.cv.element.App.interface
import contact.michniewicz.cv.element.Interface.{Desktop, Mobile}
import contact.michniewicz.cv.model.Resume
import org.scalajs.dom.window

case class App(data: Resume):
  private val section: Var[() => Element] = Var(About.render(data))

  def render(): Element = div(
    className := "wrapper",
    div(
      className := (interface match
        case Desktop => "desktop-container"
        case Mobile  => "mobile-container"
      ),
      Menu.render(section, data),
      Content.render(section.signal)
    )
  )

object App:
  private def screenAspectRatio = window.screen.width / window.screen.height

  def interface: Interface =
    if (screenAspectRatio < 1.0) Interface.Mobile
    else Interface.Desktop
