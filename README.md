OpenEmbedded/Yocto layer for Ubuntu Snappy Building Tools support
=================================================================

This meta layer adds support for Ubuntu Snappy building tools:
 * snapcraft

Note: This layer can only work on ubuntu 14.04 and *can't* work on ubuntu 16.04.

# Try it!

- Download latest yocto release

```
 $ git clone git://git.yoctoproject.org/poky
 $ cd poky
 $ git checkout krogoth
 $ git cherry-pick 8b21a516b0824aa6b47fa21287b160edfa232d96
```

- Fetch necessary layers

```
 $ git clone git://git.openembedded.org/meta-openembedded
 $ git clone git://github.com/walimis/meta-snappy-tools.git
```

- Prepare the build environment

```
 $ source oe-init-build-env
```

- Add meta-snappy-tools to your conf/bblayers.conf so that it looks similar to this

```
 BBLAYERS ?= " \
    ...
    /tmp/poky/meta-openembedded/meta-oe \
    /tmp/poky/meta-openembedded/meta-python \
    /tmp/poky/meta-snappy-tools \
        "
```

- Build snapcraft

```
 $ bitbake snapcraft
```

- Prepare snapcraft

Before using snapcraft, we need first run "snapcraft login".

```
 $ bitbake snapcraft -c devshell
 $ snapcraft login
```

Then we can use snapcraft in the yocto building environment.
