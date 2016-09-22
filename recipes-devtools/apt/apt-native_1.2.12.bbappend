python do_install_append () {
    bb.build.exec_func('do_install_include', d)
}

do_install_include () {
	install -d ${D}${includedir}
	install -d ${D}${includedir}/apt-pkg
	find ${S} -name "*.h" ! -name "private*.h" -exec install -m 0644 {} ${D}${includedir}/apt-pkg \;
}
