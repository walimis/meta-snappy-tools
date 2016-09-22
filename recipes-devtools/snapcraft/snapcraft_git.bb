SUMMARY = "snapcraft"
DESCRIPTION = "snapcraft"
HOMEPAGE = "https://www.snapcraft.io"
SECTION = "devel/python"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " git://github.com/snapcore/snapcraft.git;protocol=https;branch=master \
	file://0001-snapcraft-yocto-add-looking-directories-in-yocto.patch \
	file://0002-snapcraft-yocto-don-t-check-installed-package-in-yoc.patch \
	file://0003-snapcraft-yocto-modify-cross-compiler-to-yocto.patch \
"

# Matches the 2.17 tag
SRCREV = "27c05980f84a3ee66d002074655c2b5b54406d10"
PV = "2.17"

S = "${WORKDIR}/git"

inherit setuptools3 native

DEPENDS = " python3-apt \
            python3-chardet \
            python3-docopt \
            python3-file-magic \
            python3-libnacl \
            python3-petname \
            python3-pymacaroons \
            python3-pyyaml \
            python3-requests-native \
            python3-requests-oauthlib \
            python3-requests-toolbelt \
            python3-simplejson \
            python3-six-native \
            python3-tabulate \
            python3-jsonschema-native \
            python3-urllib3 \
            progressbar33 \
            pyxdg \
            libsodium-native \
            squashfs-tools-native \
"

BBCLASSEXTEND = "native nativesdk"
