package contact.michniewicz.cv.element

import com.raquo.laminar.api.L.{Element, a, className, div, h3, href, i, img, li, p, span, src, ul, given}
import contact.michniewicz.cv.element
import contact.michniewicz.cv.element.App.interface
import contact.michniewicz.cv.model.Resume

object About:
  def render(data: Resume)(): Element = interface match
    case element.Interface.Desktop => Desktop.render(data)
    case element.Interface.Mobile  => Mobile.render(data)

  private object Mobile:
    def render(data: Resume): Element = div(
      className := "section1 p-30",
      div(
        className := "mobile-d-flex-align-center",
        introduction(data),
        contact(data)
      )
    )

    private def introduction(data: Resume): Element = div(
      className := "mobile-user-profile",
      div(
        className := "pro-details",
        div(className := "sm-text", "Hello Everybody, I am"),
        div(className := "name", data.fullName),
        div(className := "role", data.role),
        div(
          className   := "text",
          data.bio.map(line => p(line))
        )
      )
    )

    private def contact(data: Resume): Element = div(
      className := "about-contact",
      div(
        className := "mobile-social-icons",
        span(
          a(
            href := data.linkedin,
            i(className := "fa fa-linkedin-square")
          )
        ),
        span(
          a(
            href := data.github,
            i(className := "fa fa-github-square")
          )
        ),
        span(
          a(
            href := s"mailto:${data.email}",
            i(className := "fa fa-envelope")
          )
        )
      )
    )

  private object Desktop:
    def render(data: Resume): Element = div(
      className := "section1 p-30",
      div(
        className := "sec-title",
        div(className := "pg-sub-title", "About"),
        div(className := "pg-title", "My Profile")
      ),
      div(
        className := "d-flex-align-center",
        introduction(data),
        logo(data)
      )
    )

    private def introduction(data: Resume): Element = div(
      className := "user-profile flex-1",
      div(
        className := "pro-details",
        div(className := "sm-text", "Hello Everybody, I am"),
        div(className := "name", data.fullName),
        div(className := "role", data.role),
        div(
          className   := "text",
          data.bio.map(line => p(line))
        )
      )
    )

    private def logo(data: Resume): Element = div(
      className := "user-img flex-1",
      img(
        src := data.logo
      )
    )
