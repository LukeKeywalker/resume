#! /bin/bash

sbt '~fastLinkJS' & npm run dev && kill $!
