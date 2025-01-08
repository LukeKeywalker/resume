package contact.michniewicz.cv.element

import com.raquo.laminar.api.L.{Element, Var, a, className, div, href, i, img, li, onClick, span, src, ul, given}
import contact.michniewicz.cv.element.App.interface
import contact.michniewicz.cv.model.Resume

object Menu:
  def render(section: Var[() => Element], data: Resume): Element = interface match
    case Interface.Desktop => Desktop.render(section, data)
    case Interface.Mobile  => Mobile.render(section, data)

  private object Mobile:
    def render(section: Var[() => Element], data: Resume): Element = div(
      className := "mobile-menu-content",
      logo(data),
      navigation(section, data)
    )

    private def logo(data: Resume): Element = div(
      className := "logo",
      img(src(data.logo))
    )

    private def navigation(section: Var[() => Element], data: Resume): Element = div(
      className := "nav",
      span(Link.about(section, data)),
      span(Link.resume(section, data))
      // span(Link.project(section, data))
    )

  private object Desktop:
    def render(section: Var[() => Element], data: Resume): Element = div(
      className := "desktop-menu-content p-30",
      logo(data),
      navigation(section, data),
      contactFooter(data)
    )

    private def logo(data: Resume): Element = div(
      className := "logo",
      a(
        span(data.name),
        span(data.surname)
      )
    )

    private def navigation(section: Var[() => Element], data: Resume): Element = div(
      className := "nav",
      ul(
        li(Link.about(section, data)),
        li(Link.resume(section, data))
        // li(Link.project(section, data))
      )
    )

    private def contactFooter(data: Resume): Element = div(
      className := "left-footer",
      div(
        className := "social-icons",
        ul(
          li(
            a(
              href := data.linkedin,
              i(className := "fa fa-linkedin-square")
            )
          ),
          li(
            a(
              href := data.github,
              i(className := "fa fa-github-square")
            )
          ),
          li(
            a(
              href := s"mailto:${data.email}",
              i(className := "fa fa-envelope")
            )
          )
        )
      ),
      div(
        className := "copy-rights",
        span("Built with ❤ in Scala.js and Laminar UI")
      )
    )

  private object Link:
    def about(section: Var[() => Element], data: Resume): Element = a(
      href := "#About",
      "About",
      onClick --> (_ => section.update(_ => About.render(data)))
    )

    def resume(section: Var[() => Element], data: Resume): Element = a(
      href := "#Resume",
      "Resume",
      onClick --> (_ => section.update(_ => Skills.render(data)))
    )

    def project(section: Var[() => Element], data: Resume): Element = a(
      href := "#Projects",
      "Projects",
      onClick --> (_ => section.update(_ => Projects.render))
    )
