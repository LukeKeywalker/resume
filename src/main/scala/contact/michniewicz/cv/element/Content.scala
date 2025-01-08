package contact.michniewicz.cv.element

import com.raquo.laminar.api.L.{Element, Signal, child, className, div}
import contact.michniewicz.cv.element
import contact.michniewicz.cv.element.App.interface
import contact.michniewicz.cv.element.Interface.{Desktop, Mobile}

object Content:
  def render(sectionSignal: Signal[() => Element]): Element =
    div(
      className := (interface match
        case Desktop => "desktop-main-content"
        case Mobile  => "mobile-main-content"
      ),
      child <-- sectionSignal.map(_())
    )
