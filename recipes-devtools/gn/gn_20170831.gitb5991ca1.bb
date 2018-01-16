require gn.inc

LIC_FILES_CHKSUM = "file://gn_main.cc;beginline=1;endline=3;md5=ff01c35ebd0469500da2a5ee0a8fafcf"

S = "${WORKDIR}/git"

SRC_URI = "git://chromium.googlesource.com/chromium/src/tools/gn;protocol=https"
SRC_URI += "file://0001-Add-missing-deps.patch;striplevel=3"

SRCREV = "b5991ca16991dfbfcba69d5506e6bfaf694352fe"

do_compile () {
  cd ${S}
  ./bootstrap/bootstrap.py -s
}

