SUMMARY     = "Mediaplayer Service Binding"
DESCRIPTION = "AGL Mediaplayer Service Binding"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/agl-service-mediaplayer"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-service-mediaplayer;protocol=https;branch=sandbox/ruke47/ces2018"
SRCREV  = "${AUTOREV}"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

DEPENDS = "json-c gstreamer1.0 gstreamer1.0-plugins-base"
RDEPENDS_${PN} = "agl-service-mediascanner gstreamer1.0-plugins-bad-waylandsink"

inherit cmake aglwgt pkgconfig

EXTRA_OECMAKE += "${@bb.utils.contains('DISTRO_FEATURES', 'agl-audio-4a-framework', '-DHAVE_4A_FRAMEWORK=1' , '', d)}"
