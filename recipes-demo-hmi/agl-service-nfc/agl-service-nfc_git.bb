SUMMARY     = "agl-service-nfc"
DESCRIPTION = ""
HOMEPAGE    = "https://www.github.com/iotbzh/nfc-binding"
SECTION     = "apps"
DEPENDS     = "af-binder json-c libnfc"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit cmake pkgconfig aglwgt

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-service-nfc;protocol=https;branch=${AGL_BRANCH}"
#SRCREV = "${AGL_APP_REVISION}"
SRCREV = "f9e5259d74c8cf521921a96377c64691b5b3c3ae"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

