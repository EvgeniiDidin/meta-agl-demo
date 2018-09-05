SUMMARY     = "GeoClue Service Binding"
DESCRIPTION = "AGL GeoClue Service Binding"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/agl-service-geoclue"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-service-geoclue;protocol=https;branch=${AGL_BRANCH}"
#SRCREV  = "${AGL_APP_REVISION}"
SRCREV = "ed1352fd128f98c1ba8f7bad15f6e66322544e5b"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

DEPENDS = "json-c geoclue"

inherit cmake aglwgt pkgconfig
