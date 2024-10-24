package com.sportscanner.etl.bookings

/**
 * Created by yasir on 24/10/2024.
 */

import com.sportscanner.common.references

object fetchBookingInformation {
  def main(args: Array[String]): Unit = {
    println(s"Fetching info from another module: ${references.statusHealthUrl}")
  }
}
