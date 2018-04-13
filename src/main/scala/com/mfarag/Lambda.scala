package com.mfarag

import com.mfarag.core.LambdaCore
import play.api.libs.json.{Json, Reads, Writes}

object Lambda extends LambdaCore[Request, Result] {

  implicit protected val reads: Reads[Request] = Json.reads[Request]
  implicit protected val writes: Writes[Result] = Json.writes[Result]

  def lambda(r: Request): Result = Result(r.s.toUpperCase)
}