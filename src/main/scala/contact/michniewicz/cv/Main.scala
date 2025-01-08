package contact.michniewicz.cv

import com.raquo.laminar.api.L.renderOnDomContentLoaded
import contact.michniewicz.cv.data.LukaszMichniewicz
import contact.michniewicz.cv.element.App
import org.scalajs.dom

object Main:
  private val data = LukaszMichniewicz.resume

  @main
  def render(): Unit = renderOnDomContentLoaded(
    dom.document.getElementsByTagName("body").head,
    App(data).render()
  )
