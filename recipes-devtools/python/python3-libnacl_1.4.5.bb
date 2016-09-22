SUMMARY = "Python 2 and 3 compatibility library"
LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI[md5sum] = "8ee7fd411600a4f05dae626d09723574"
SRC_URI[sha256sum] = "81ef71c06f55aa3c6324386cc11c0b66c369bb0e3b491201d4ecf298c1b11016"

DEPENDS = " libsodium-native"

inherit pypi setuptools3 native
