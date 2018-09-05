SUMMARY     = "Geofence Service Binding"
DESCRIPTION = "AGL Geofence Service Binding"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/agl-service-geofence"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-service-geofence;protocol=https;branch=${AGL_BRANCH}"
#SRCREV  = "${AGL_APP_REVISION}"
SRCREV = "322feb3f174dfdd597f70d46513b4b2eb3f748f5"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

DEPENDS = "json-c"
RDEPENDS_${PN} = "agl-service-gps"

inherit cmake aglwgt pkgconfig
