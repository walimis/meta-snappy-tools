SUMMARY = "Python support for libapt"
SECTION = "devel/python"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://launchpad.net/ubuntu/+archive/primary/+files/python-apt_${PV}~beta1build1.tar.xz \
"

SRC_URI[md5sum] = "115a87b2373dc1a67f1ae9dc7dd1026e"
SRC_URI[sha256sum] = "8d0a855299b8eb114476bdc7bef1b6fd6b35a4ee7ae90d4d56a2018977784148"

S = "${WORKDIR}/python-apt-${PV}~beta1"

inherit setuptools3 native

DEPENDS = " apt-native"

#do_configure_prepend() {
#    # upstream setup.py overcomplicated, use ours
#    install -m 0644 ${WORKDIR}/setup.py ${S}
#}
