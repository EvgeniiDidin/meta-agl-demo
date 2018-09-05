SUMMARY     = "Media Player for CES2017 AGL Demonstration"
DESCRIPTION = "AGL HMI Application for demonstrating Media Player on AGL Distribution"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/mediaplayer"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/apps/mediaplayer;protocol=https;branch=${AGL_BRANCH}"
SRCREV  = "2047dd6780b8174ef081172ff58436bcf7ef9399"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

# build-time dependencies
DEPENDS += "qtquickcontrols2 \
            qtmultimedia \
            qtwebsockets \
            libqtappfw \
            virtual/libhomescreen \
            qlibwindowmanager \
"

inherit qmake5 aglwgt

RDEPENDS_${PN} += "qtmultimedia \
                   qtmultimedia-qmlplugins \
                   agl-service-mediaplayer \
                   agl-service-bluetooth \
"
